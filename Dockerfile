# Use a imagem base com Java 17
FROM openjdk:17-jdk-alpine

# Configuração do diretório de trabalho
WORKDIR /app

# Copia o arquivo JAR da aplicação para o diretório de trabalho
COPY target/mob-rti-performance-1.0.0.jar .

# Exponha a porta que o aplicativo Spring Boot usará
EXPOSE 8080

# Comando para iniciar a aplicação Spring Boot
CMD ["java", "-jar", "mob-rti-performance-1.0.0.jar"]