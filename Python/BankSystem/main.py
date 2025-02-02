from fastapi.middleware.cors import CORSMiddleware
from fastapi import FastAPI
import uvicorn
from sqlalchemy import create_engine
from sqlalchemy.orm import sessionmaker
from core.config import settings
from database.models import Base
from user.user_router import router as user_router
from bank.bank_router import router as bank_router

DB_URL = f"mysql+pymysql://{settings.DB_USER}:{settings.DB_PASSWORD}@{settings.DB_HOST}:{settings.DB_PORT}/{settings.DB_NAME}?charset=utf8"

engine = create_engine(DB_URL)

SessionLocal = sessionmaker(autocommit=False, autoflush=False, bind=engine)

Base.metadata.create_all(bind=engine)

app = FastAPI(title=settings.APP_NAME, debug=settings.DEBUG, version='1.0.0')
app.router.redirect_slashes = False

@app.get("/")
def read_root():
    return "Server is running!"