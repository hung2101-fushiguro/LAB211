create database CourseManage
use CourseManage

create table Course(
	course_id varchar(50) primary key,
	name_course nvarchar(100) not null,
	credits int check(credits > 0),
	begin_date date not null,
	end_date date not null
	);
alter table Course
add mode varchar(10) check (mode IN ('online', 'offline')) default 'offline';


INSERT INTO Course (course_id, name_course, credits, begin_date, end_date, mode)
VALUES (
    'PRO192',
    N'Object-Oriented Programming ',
    3,
    CAST(GETDATE() AS DATE),
    DATEADD(MONTH, 4, CAST(GETDATE() AS DATE)),
    'offline'
);
INSERT INTO Course (course_id, name_course, credits, begin_date, end_date, mode)
VALUES (
	'SWE201c', N'Introduction to Software Engineering', 3, CAST(Getdate() as date), dateadd(month, 4, cast(getdate() as date)), 'online'
	);


