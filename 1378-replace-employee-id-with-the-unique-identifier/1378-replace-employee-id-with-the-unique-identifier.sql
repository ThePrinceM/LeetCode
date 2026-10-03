# Write your MySQL query statement below
SELECT e.name, d.unique_id
FROM Employees e
LEFT JOIN EmployeeUNI d
ON e.id = d.id;