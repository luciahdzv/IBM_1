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
('Shopping',7000.00,14999.99,33,75,'Clasica, Afinity Card, Office Depot, Costco, Best Buy Banamex, The Home Depot'),
('Shopping',15000.00,34999.99,18,23,'Bsmart, Afinity Card'),
('Shopping',15000.00,34999.99,24,32,'Oro, Afinity Card, Office Depot, Costco, Best Buy Banamex, The Home Depot'),
('Shopping',15000.00,34999.99,33,75,'Oro, Office Depot, Costco, Best Buy Banamex, The Home Depot'),
('Shopping',35000.00,49999.99,18,23,'Bsmart A'),
('Shopping',35000.00,49999.99,24,75,'Platinum,Office Depot, Costco, Best Buy Banamex, The Home Depot'),
('Shopping',50000.00,10000000.99,18,23,'Bsmart, Afinity Card'),
('Shopping',50000.00,10000000.99,24,75,'Platinum'),

('Travels',12000.00,29999.99,18,75,'Citi / AAdvantage'),
('Travels',30000.00,34999.99,18,23,'Citi / AAdvantage'),
('Travels',30000.00,34999.99,24,75,'Citi / AAdvantage, Platinum'),
('Travels',35000.00,49999.99,18,23,'Citi / AAdvantage'),
('Travels',35000.00,49999.99,24,75,'Citi / AAdbantage, Platinum'),
('Travels',50000.00,100000000.00,18,22,'Citi / AAdvantage'),
('Travels',50000.00,100000000.00,23,75,'Platinum'),

('Help',12000.00,100000000.00,18,75,'Banamex Teletón, APAC'),

('My busines',7000.00,100000000.00,18,75,'Office Depot, Costco, Best BuyBanamex, The Home Depot'),

('Sports',7000.00,34999.99,18,75,'Martí Clasica Citibanamex, América Deporteísmo, Pumas Deporteísmo'),
('Sports',35000.00,100000000.00,18,75,'Martí Premium Citibanamex'),

('My Style',7000.00,14999.99,18,32,'Bsmart, Afinity Card'),
('My Style',7000.00,14999.99,33,75,'Bsmart'),
('My Style',15000.00,29999.99,18,23,'Bsmart, Afinity Card'),
('My Style',15000.00,29999.99,24,32,'Bsmart Oro, Afinity Card'),
('My Style',15000.00,29999.99,33,75,'Oro'),
('My Style',30000.00,34999.99,18,23,'Bsmart, Afinity Card'),
('My Style',30000.00,34999.99,24,32,'Bsmart, Platinum, Afinity Card'),
('My Style',30000.00,34999.99,33,75,'Platinum'),
('My Style',35000.00,100000000.00,18,23,'Bsmart'),
('My Style',35000.00,100000000.00,24,75,'Bsmart, Platinum')

;