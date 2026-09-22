ALTER TABLE products
    ADD COLUMN id_category INT,
    ADD CONSTRAINT fk_product_category
    FOREIGN KEY (id_category)
    REFERENCES category(id);