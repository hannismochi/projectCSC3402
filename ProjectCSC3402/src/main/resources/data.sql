CREATE TABLE IF NOT EXISTS users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(255) NOT NULL,
    name VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL
);

INSERT INTO users(email, name, password) VALUES
    ('admin@gmail.com','admin','$2a$12$JGriZzgFwZNEeuIzFcocjug9wb0/G0EJ1nco27FZoCvVLmfpfiiWe');
INSERT INTO users(email, name, password) VALUES
    ('test@gmail.com','John','$2a$12$F2QRPx07EsQTswGmyxB4sOw7RLCnIDqux/LWhO5vfegs42OS2LE.C');
INSERT INTO users(email, name, password) VALUES
    ('abc@gmail.com','Alex','$2a$12$aRRjmnRA5MkVg3M.xSc1G.jQkkvfx73WJhIvI.77IMkJyZpTT5dvC');
INSERT INTO users(email, name, password) VALUES
    ('def@gmail.com','Boss','$2a$12$MBeLkc4HGARn/pOnBl1HSugtEBvL5EwRvQ4EzqAykvt4hUogKl/Zy');

CREATE TABLE IF NOT EXISTS roles (
id BIGINT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(255) NOT NULL
);

INSERT INTO roles(name) VALUES ('ROLE_ADMIN');
INSERT INTO roles(name) VALUES ('ROLE_USER');

CREATE TABLE IF NOT EXISTS users_roles (
    user_id BIGINT NOT NULL,
    role_id BIGINT NOT NULL,
    PRIMARY KEY (user_id, role_id),
    FOREIGN KEY (user_id) REFERENCES users(id),
    FOREIGN KEY (role_id) REFERENCES roles(id)
);

INSERT INTO users_roles(role_id, user_id) VALUES (1,1);
INSERT INTO users_roles(role_id, user_id) VALUES (2,2);
INSERT INTO users_roles(role_id, user_id) VALUES (2,3);
INSERT INTO users_roles(role_id, user_id) VALUES (2,4);
INSERT INTO users_roles(role_id, user_id) VALUES (1,4);



