
### 1 create table
```sql
create database if not exists hms; 
use hms;
CREATE TABLE IF NOT EXISTS `t_users`(
   `id` INT UNSIGNED AUTO_INCREMENT,
   `name` VARCHAR(100) NOT NULL,
   `age` INT ,
   PRIMARY KEY ( `id` )
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

select * from t_users;
insert into t_users values (101,'Weison',10);
```