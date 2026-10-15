# Write your MySQL query statement below
SELECT p.project_id, ROUND(IFNULL(SUM(e.experience_years)/COUNT(e.employee_id),0),2) AS average_years
FROM Project p
LEFT JOIN Employee e
ON e.employee_id = p.employee_id 
GROUP BY p.project_id