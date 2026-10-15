/* This is an basic schema of sqlite database that will be used to store the uploaded file's path address in the databases for easy retrieval.
it's a dump file that can be read by sqlite to  create the table and database automatically 
after entering to sqlite3 cli interface type the following command:     .read FreunionDB_schema.sql

*/



PRAGMA foreign_keys=OFF;
BEGIN TRANSACTION;
CREATE TABLE IF not EXISTS users(
UUID INT PRIMARY KEY NOT NULL,
username TEXT NOT NULL UNIQUE,
mobile INT NOT NULL,
email CHAR(254) CHECK(email LIKE '%@%.%'),
  password CHAR(50)
);
CREATE TABLE IF NOT EXISTS users_files(
file_UUID INT PRIMARY KEY NOT NULL,
file_name TEXT NOT NULL,
file_size INT,
file_type varchar(6),
isshareable bool,
file_owner text,
owner_uuid INT,
FOREIGN KEY(file_owner) REFERENCES users(username),

FOREIGN Key( owner_uuid) REFERENCES users(UUID)
);
CREATE TABLE IF NOT EXISTS shared_files(
shared_file_UUID INT,
file_sender INT,
file_reciever INTEGER,

FOREIGN key( shared_file_UUID) REFERENCES users_files(file_UUID),
  FOREIGN KEY( file_sender) REFERENcEs users_files( owner_uuid),
  FOREIGN KEY( file_reciever) REFERENcEs users( UUID)
 
);
COMMIT;
