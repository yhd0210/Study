from decouple import config
from pydantic_settings import BaseSettings

class Settings(BaseSettings):
    DB_USER: str = config('DB_USER')
    DB_PASSWORD: str = config('DB_PASSWORD')
    DB_HOST: str = config('DB_HOST')
    DB_NAME: str = config('DB_NAME')
    APP_NAME: str = "BankSystem-App"
    DEBUG: bool = False
    DB_PORT: int = 3306

settings = Settings()
