CREATE TABLE IF NOT EXISTS SALARY (
  ID INTEGER,
  VALUE DOUBLE
);
/
CREATE TABLE IF NOT EXISTS SalaryTrx (
  ID INTEGER,
  VALUE DOUBLE,
  PRIMARY KEY (ID)
);
/
INSERT INTO SalaryTrx VALUES (20, 30000);