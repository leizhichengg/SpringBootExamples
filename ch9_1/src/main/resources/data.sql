insert into SYS_USER(id,username,password) values (1,'lzc','$2a$10$ESRaVCGuIV/mIqDDBlCGaOopq3lzLo07XHteBVzwhSVtLKP.v39CK');
insert into SYS_USER(id,username,password) values (2,'test','$2a$10$E33yqYlsMRbYPga7XCrb..L72uQZ1YkeZm6b/syIu61.KUgtSaF1K');

insert into SYS_ROLE(id,name) values (1,'ROLE_ADMIN');
insert into SYS_ROLE(id,name) values (2,'ROLE_USER');

insert into SYS_USER_ROLES(SYS_USER_ID,ROLES_ID) values (1,1);
insert into SYS_USER_ROLES(SYS_USER_ID,ROLES_ID) values (2,2);
