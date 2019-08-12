--
-- @lc app=leetcode.cn id=181 lang=mysql
--
-- [181] 超过经理收入的员工
--
# Write your MySQL query statement below

select e1.name as employee from employee e1, employee e2
  where e1.managerid = e2.id 
  and e1.salary > e2.salary

