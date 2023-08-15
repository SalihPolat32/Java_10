#JDK sürümü
FROM openjdk:20

# Projenin JAR dosyasının image içindeki adresi
ARG JAR_FILE=target/*.jar

# image içindeki JAR dosyasının adı
COPY ${JAR_FILE} application.jar

# Linux güncellemesi
CMD apt-get update-y

# Projenin çalışacağı iç port
EXPOSE 8080

# Container için projedeki JAR dosyası  çalıştırılıyor
ENTRYPOINT ["java", "-jar", "application.jar"]