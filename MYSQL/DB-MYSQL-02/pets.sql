-- Seleccionar todo en una tabla
SELECT * FROM users;

-- Seleccionar solo una columna
SELECT first_name FROM users;

-- Insertar datos a tabla pets
INSERT INTO pets
(first_name, fav_food, type, users_idusers)
VALUES
('Griselo', 'Fresa', 'Nejo', 1),
('Nicky', 'Caldito', 'Dogo', 2),
('Pepperoni', 'Huesitos de manzana', 'Dogo', 3),
('Pepe', 'Semillas de girasol', 'Cotorro', 3);

-- Selecionar pets
SELECT * FROM pets
WHERE user_idusers = 3;



