create database trigger_db;
use trigger_db;

create table profile (
pid int primary key,
pname varchar (100),
psal decimal(10,2),
p_pancard varchar(20)
);

insert into profile (pid, pname, psal, p_pancard)
values
(1, 'Shubham', 50000.00, 'ABC123'),
(2, 'Rahul', 60000.00, 'DEF456'),
(3, 'Amit', 55000.00, 'GHI789'),
(4, 'Pradnya', 65000.00, 'JKL012'),
(5, 'Neha', 58000.00,'MNO321');

select * from profile;

create table profileaudit (
aid int  auto_increment PRIMARY KEY,
new_value varchar(20),
old_value varchar(20),
updated_by varchar(100),
updated_on datetime
);


DELIMITER //
create trigger profile_update_audit
after update on profile
for each row 
BEGIN 
     insert into profileaudit(
      new_value,
      old_value,
      updated_by,
      updated_on
     )
     values(
       new.p_pancard,
       old.p_pancard,
       user(),
       now()
     );
END //

select * from profile;

update  profile 
set p_pancard = 'XYZ789'
where pid = 1;

select * from profile;


select * from profileaudit;

update profile
set p_pancard = 'PQR657'
where pid = 1;




