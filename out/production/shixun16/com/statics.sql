-- 统计函数的使用
SELECT * FROM student
-- 统计一个班级有多少个学生
SELECT COUNT(*) FROM student -- 6

-- 统计数学成绩大于90的学生有多少个
SELECT COUNT(math) FROM student
	WHERE math > 90
-- 统计总分大于250的学生人数
SELECT COUNT(*) FROM student
	WHERE (chinese+math+english) > 250
	
-- count(*),count(列名)的区别
-- count(*)返回满足条件的记录的行数
-- count(列名)：统计满足条件的某列有多少个，但是会排除null


-- sum函数的使用
-- 统计一个班级的数学总成绩
SELECT SUM(math) FROM student
-- 统计一个班级的语文，数学，英语各科总成绩
SELECT SUM(Chinese),SUM(math),SUM(english) FROM student   
-- 567 647 662
-- 统计一个班级的语文，数学，英语总成绩
SELECT SUM(chinese+math+english) FROM student
-- 统计一个班语文成绩平均分
SELECT SUM(chinese)/COUNT(*) FROM student

SELECT SUM(chinese+math+english) FROM student
	WHERE `name` = '李眉';
-- avg函数使用
-- 求一个班级的数学平均分
SELECT AVG(math) FROM student
-- 求一个班级的成绩平均分
SELECT AVG(chinese+math+english) FROM student


-- max/min 函数的使用
-- 求班级总分的最高分和最低分
SELECT MAX(chinese+math+english) FROM student -- 371

SELECT MIN(chinese+math+english) FROM student -- 230

-- 求班级数学的最高分和最低分
SELECT MAX(math),MIN(math) FROM student
-- 140 90

