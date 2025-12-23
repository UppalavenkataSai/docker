# Use official NGINX image
FROM nginx:alpine

# Remove default NGINX static files
RUN rm -rf /usr/share/nginx/html/*

# Copy our webpage to NGINX html directory
COPY index.html /usr/share/nginx/html/

# Expose port 80
EXPOSE 80
