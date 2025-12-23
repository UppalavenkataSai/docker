# Use official Apache HTTPD image
FROM httpd:2.4-alpine
# Copy custom configuration file to the container
#remove default config
RUN rm -rf /usr/local/apache2/htdocs/*
# Copy custom index.html to the container
COPY index.html /usr/local/apache2/htdocs/
# Expose port 80
EXPOSE 80
# Start Apache HTTPD server