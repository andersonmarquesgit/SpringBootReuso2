-- Inserts de TB_FUNCTION --
INSERT INTO tb_function(id, type, description)
    VALUES (1,'Função Pública', 'Funcionalidade acessada apenas pela Internet');

INSERT INTO tb_function(id, type, description)
    VALUES (2,'Função Especial', 'Funcionalidade acessada tanto pela Internet quanto pela Intranet');
    
INSERT INTO tb_function(id, type, description)
    VALUES (3,'Função Reservada', 'Funcionalidade acessada apenas pela Intranet');
    
-- Inserts de TB_USER --
INSERT INTO tb_user(id, name, email, password, age)
    VALUES (1,'Anderson Marques', 'andersonmarques.ci@gmail.com', '123Mudar', 32);

INSERT INTO tb_user(id, name, email, password, age)
    VALUES (2,'Carlos Alberto', 'calberto@gmail.com', '123Mudar', 34);
    
INSERT INTO tb_user(id, name, email, password, age)
    VALUES (3,'Heloisa Maria', 'helomaria@gmail.com', '123Mudar', 29);
    
-- Inserts de TB_PROFILE --
INSERT INTO tb_profile(id, view, insert, update, delete, function_id, user_id)
    VALUES (1, true, true, true, false, 1, 1);
    
INSERT INTO tb_profile(id, view, insert, update, delete, function_id, user_id)
    VALUES (2, true, false, false, false, 2, 1);
    
INSERT INTO tb_profile(id, view, insert, update, delete, function_id, user_id)
    VALUES (3, true, true, true, false, 3, 1);