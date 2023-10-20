CREATE USER 'tester'@'localhost' IDENTIFIED BY 'StrongerPassword123!';
--change user and password name if needed!

GRANT ALL PRIVILEGES ON Testing.* TO 'tester'@'localhost'; --Change database name