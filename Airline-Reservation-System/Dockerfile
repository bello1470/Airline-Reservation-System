FROM ubuntu:latest
LABEL authors="bellotech"

ENTRYPOINT ["top", "-b"]

FROM openjdk
WORKDIR /app
COPY . /app
RUN  airlinereservationsystem.java