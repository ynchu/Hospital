use hosptial;

insert into department
values (1, '儿科', 'A201');
insert into department
values (2, '五官科', 'A202');
insert into department
values (3, '传染科', 'A203');
insert into department
values (4, '中医科', 'A204');

insert into ranks
values (1, '主治医师');
insert into ranks
values (2, '护士');

insert into medicalcard
values (1, '老李', 1, 30, '987654321654321321', '98765432121', 2000);
insert into medicalcard
values (2, '老王', 0, 30, '987654321654321322', '98765432122', 2000);
insert into medicalcard
values (3, '老头', 0, 30, '987654321654321323', '98765432123', 2000);

insert into doctor
values (1, 1, 1, '扁鹊', 0, 20, '112345678912', '123456789987654321');
insert into doctor
values (2, 2, 2, '李白', 0, 20, '112345678913', '123456789456789123');
insert into doctor
values (3, 3, 1, '王昭君', 1, 20, '12345678914', '123456789123456789');
insert into doctor
values (4, 3, 2, '笑笑', 1, 20, '12345678915', '123456789123456788');

insert into examination
values (1, 1, '血常规', 100, 'D201');
insert into examination
values (2, 2, '耳部检查', 200, 'D202');
insert into examination
values (3, 3, '肺部检查', 300, 'D203');
insert into examination
values (4, 4, '望闻问切检查', 400, 'D204');

insert into registration
values (1, 1, 1, '2020-6-1', 100);
insert into registration
values (2, 2, 2, '2020-6-1', 100);
insert into registration
values (3, 3, 3, '2020-6-1', 100);
insert into registration
values (4, 2, 1, '2020-6-1', 100);

insert into examinationbill
values (1, 1, '2020-6-1');
insert into examinationbill
values (2, 2, '2020-6-2');
insert into examinationbill
values (3, 3, '2020-6-3');
insert into examinationbill
values (4, 4, '2020-6-4');

insert into examinationtable
values (1, 1, 1);
insert into examinationtable
values (2, 2, 2);
insert into examinationtable
values (3, 3, 3);

insert into medicine
values (1, '阿莫西林', '中医制药厂', '2020-6-1', 20, 100);
insert into medicine
values (2, '头孢', '中医制药厂', '2020-6-1', 20, 100);
insert into medicine
values (3, '枇杷露', '中医制药厂', '2020-6-1', 20, 100);
insert into medicine
values (4, '金瓜子', '中医制药厂', '2020-6-1', 20, 100);
insert into medicine
values (5, '999感冒灵', '中医制药厂', '2020-6-1', 20, 100);

insert into medicinebill
values (1, 1, '2020-6-1');
insert into medicinebill
values (2, 2, '2020-6-1');
insert into medicinebill
values (3, 3, '2020-6-1');
insert into medicinebill
values (4, 4, '2020-6-1');

insert into medicinetable
values (1, 1, 1, 10);
insert into medicinetable
values (2, 1, 2, 10);
insert into medicinetable
values (3, 2, 1, 10);
insert into medicinetable
values (4, 2, 2, 10);
