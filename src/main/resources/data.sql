DROP TABLE IF EXISTS CLIENT;

CREATE TABLE CLIENT (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  email VARCHAR(250) NOT NULL
);

INSERT INTO CLIENT (name, email) VALUES
  ('Aliko', 'aliko_peace@gmail.com'),
  ('Bill', 'billgates@microsoft.com'),
  ('Folrunsho', 'folrunshoure@facebook.com');