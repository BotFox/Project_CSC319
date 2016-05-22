Project_CSC319
=====

CSC319 Object-Oriented Software Development : Project 

1. 10/2/2016 : Create Repository 
2. 23/4/2016 : Final Design database
3. 23/4/2016 : Re-Design GUI



Database
======

ToIBank_AccLogin

(FK)AccID |(PK) username |password  |Lastest_Login|
---|---|---|---|
varchar(10)|varchar(16)|varchar(16)|timestamp|

ToIBank_Account

(PK)main_AccID |Name |Surename |Birthday |Phone |Email |Date_Register	|Balance |Currency |
---|---|---|---|---|---|---|---|---|
varchar(10)|varchar(20)|varchar(20)|datetime|bigint(10)|varchar(20)|timestamp|double|varchar(3)|

ToIBank_AccLogin

(PK)statement_number |accdeposite |	accwithdraw |amount |accde_balance |accwi_balance |time |
---|---|---|---|---|---|---|
int(11)|varchar(10)|varchar(10)|double|double|double|timestamp|
