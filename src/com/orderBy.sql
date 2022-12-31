-- order by 的使用
-- asc 升序（默认）
-- desc 降序
-- 数学成绩排序后 升序
USE db01
SELECT * FROM student
	ORDER BY math;
-- 对总分从低到高的顺序输出
SELECT * FROM student
	ORDER BY (chinese+math+english)
	
-- 对总分从高到低的顺序输出（降序）
SELECT * FROM student
	ORDER BY (chinese+math+english) DESC
-- hsp	  where 子句不能使用列别名，order by可以使用列别名
SELECT `name` ,(chinese+math+english) AS total_score FROM student
	ORDER BY total_score DESC
-- 对姓李的学生成绩排序输出（升序）

INSERT INTO student 
	VALUES(6,'李眉',100,100,100);
-- order by 只能放在最后面
SELECT * FROM student
	WHERE `name` LIKE '李%'   -- 模糊查询 like    %可以表示多个不确定的字符
	ORDER BY (chinese+math+english) DESC
	
SELECT * FROM student
