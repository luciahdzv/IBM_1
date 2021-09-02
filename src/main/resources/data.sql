--DROP TABLE IF EXISTS categories CASCADE;


CREATE TABLE categories 
 (
categoryID int auto_increment Primary Key,
passion VARCHAR(100) not null,
minSalary NUMERIC(18,2) not null,
maxSalary NUMERIC(18,2) not null,
minAge INT not null,
maxAge INT not null,
creditType VARCHAR(200) not null
);


INSERT INTO categories (passion, minSalary, maxSalary, minAge, maxAge, creditType) values
('Shopping',7000.00,14999.99,18,23,'Bsmart, Afinity Card'),
('Shopping',7000.00,14999.99,24,32,'Bsmart, Clasica, Afinity Card, Office Depot, Costco, Best Buy Banamex, The Home Depot'),
('Shopping',7000.00,14999.99,33,75,'Clasica, Afinity Card, Office Depot, Costco, Best Buy Banamex, The Home Depot')

;