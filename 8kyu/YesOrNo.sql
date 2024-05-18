/*Complete the method that takes a boolean value and return a "Yes" string for true, or a "No" string for false.*/
SELECT bool,
CASE
WHEN bool IS true THEN 'Yes'
WHEN bool IS false THEN 'No'
END res FROM booltoword;
