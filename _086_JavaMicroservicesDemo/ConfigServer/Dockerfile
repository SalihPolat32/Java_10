# JDK Sürümü
FROM amazoncorretto:17

# Projenin JAR Dosyasının Image İçindeki Adresi
ARG JAR_FILE=target/*.jar

# Image İçindeki JAR Dosyasının Adı
COPY ${JAR_FILE} application.jar

# Linux Güncellemesi
CMD apt-get update-y

# Projenin Çalışacağı İç Port
EXPOSE 8888

# Container İçin Projedeki JAR Dosyası Çalıştırılıyor
ENTRYPOINT ["java", "-jar", "application.jar"]

# Docker Image Haline Getirme Komutu
# docker build --build-arg JAR_FILE=build/libs/ConfigServer-v.0.0.1.jar -t salihpolat32/config-server:v001 .