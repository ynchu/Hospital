/*==============================================================*/
/* Table: ranks                                                 */
/*==============================================================*/
drop table  if  exists ranks;
create table ranks
(
   id                   int                            not null,
   name                 varchar                        null,
   constraint PK_RANKS primary key clustered (id)
);

/*==============================================================*/
/* Table: department                                            */
/*==============================================================*/
drop table if exists department;
create table department
(
   id                   int                            not null,
   name                 varchar(20)                    null,
   address              varchar(30)                    null,
   constraint PK_DEPARTMENT primary key clustered (id)
);

/*==============================================================*/
/* Table: medicalcard                                           */
/*==============================================================*/
drop table if exists medicalcard;
create table medicalcard
(
   id                   int                            not null,
   name                 varchar(30)                    null,
   sex                  int                            null,
   age                  int                            null,
   idnum                varchar(20)                    null,
   tel                  varchar(15)                    null,
   balance              float                          null,
   constraint PK_MEDICALCARD primary key clustered (id)
);

/*==============================================================*/
/* Table: medicine                                              */
/*==============================================================*/
drop table if exists medicine;
create table medicine
(
   id                   int                            not null,
   name                 varchar(30)                    null,
   producer             varchar(20)                    null,
   pdate                date                           null,
   cost                 float                          null,
   stock                int                            null,
   constraint PK_MEDICINE primary key clustered (id)
);


/*==============================================================*/
/* Table: doctor                                                */
/*==============================================================*/
drop    table if exists doctor;
create table doctor
(
   id                   int                            not null,
   dep_id               int                            not null,
   ran_id               int                            not null,
   name                 varchar                        not null,
   sex                  int                            not null,
   age                  int                            not null,
   tel                  varchar                        not null,
   idnum                varchar                        not null,
   constraint PK_DOCTOR primary key clustered (id),
   foreign key  (dep_id) references department(id),
   foreign key  (ran_id) references ranks(id)
);

/*==============================================================*/
/* Table: registration                                          */
/*==============================================================*/
drop table if exists registration;
create table registration
(
   id                   int                            not null,
   med_id               int                            not null,
   doc_id               int                            not null,
   rdate                date                           not null,
   cost                 float                          not null,
   constraint PK_REGISTRATION primary key clustered (id),
      foreign key  (med_id) references medicalcard(id),
      foreign key  (doc_id) references doctor(id)
);

/*==============================================================*/
/* Table: examination                                           */
/*==============================================================*/
drop table if exists examination;
create table examination
(
   id                   int                            not null,
   dep_id               int                            null,
   name                 varchar(30)                    null,
   cost                 float                          null,
   address              varchar(50)                    null,
   constraint PK_EXAMINATION primary key clustered (id),
      foreign key  (dep_id) references department(id)
);


/*==============================================================*/
/* Table: medicinebill                                          */
/*==============================================================*/
drop table if exists medicinebill;
create table medicinebill
(
   id                   int                            not null,
   reg_id               int                            null,
   mbdate               date                           null,
   constraint PK_MEDICINEBILL primary key clustered (id),
      foreign key  (reg_id) references registration(id)
);



/*==============================================================*/
/* Table: examinationbill                                       */
/*==============================================================*/
drop table if exists examinationbill;
create table examinationbill
(
   id                   int                            not null,
   reg_id               int                            null,
   edate                date                           null,
   constraint PK_EXAMINATIONBILL primary key clustered (id),
   foreign key  (reg_id) references registration(id)
);


/*==============================================================*/
/* Table: medicinetable                                         */
/*==============================================================*/
drop table if exists medicinetable;
create table medicinetable
(
   id                   int                            not null,
   med_id               int                            not null,
   med_id2              int                            not null,
   count                int                            not null,
   constraint PK_MEDICINETABLE primary key clustered (id),
      foreign key  (med_id) references medicinebill(id),
      foreign key  (med_id2) references medicine(id)
);



/*==============================================================*/
/* Table: examinationtable                                      */
/*==============================================================*/
drop table if exists examinationtable;
create table examinationtable
(
   id                   int                            not null,
   exa_id              int                            not null,
   exa_id2              int                            not null,
   constraint PK_EXAMINATIONTABLE primary key clustered (id),
      foreign key  (exa_id) references examinationbill(id),
      foreign key  (exa_id2) references examination(id)

);

