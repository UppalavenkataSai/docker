from flask import Flask

app = Flask(__name__)

@app.route("/")
def home():
    return """
    <html>
        <head>
            <title>Docker + Python</title>
        </head>
        <body style="font-family: Arial; text-align: center;">
            <h1>Hello from Python in Docker! 🐳</h1>
            <p>This webpage is running inside a Docker container.</p>
        </body>
    </html>
    """

if __name__ == "__main__":
    app.run(host="0.0.0.0", port=5000)
