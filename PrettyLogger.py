import sys
import time

from datetime import datetime
from colorama import Fore, Style, init
class PrettyLogger:
    def __init__(self, use_timestamp=True):
        self.use_timestamp = use_timestamp

    def _get_time(self):
        return datetime.now().strftime('%Y-%m-%d %H:%M:%S') if self.use_timestamp else ''

    def _log(self, message, level, color):
        timestamp = self._get_time()
        formatted = f"{color}[{timestamp}] [{level}]: {message}{Style.RESET_ALL}"
        print(formatted)

    def info(self, message):
        self._log(message, "INFO", Fore.CYAN)

    def success(self, message):
        self._log(message, "SUCCESS", Fore.GREEN)

    def warning(self, message):
        self._log(message, "WARNING", Fore.YELLOW)

    def error(self, message):
        self._log(message, "ERROR", Fore.RED)

    def debug(self, message):
        self._log(message, "DEBUG", Fore.MAGENTA)

    def progress_bar(self, current, total, bar_length=40, prefix='Progress', suffix='Complete', color=Fore.BLUE):
        percent = float(current) / total
        filled_length = int(bar_length * percent)
        bar = '█' * filled_length + '-' * (bar_length - filled_length)
        timestamp = self._get_time()
        sys.stdout.write(f'\r[{timestamp}] {color}{prefix} |{bar}| {int(percent*100)}% {suffix}{Style.RESET_ALL}')
        sys.stdout.flush()
        if current >= total:
            sys.stdout.write('\n')
# Example
# logger = PrettyLogger()
# total = 100
# for i in range(total + 1):
#     logger.progress_bar(i, total, prefix='Downloading', suffix='Complete', color=Fore.CYAN)
#     time.sleep(0.03)

# logger.success("Download finished.")