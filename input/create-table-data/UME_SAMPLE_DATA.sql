DELETE FROM ALBUM_BASIC ;
INSERT INTO ALBUM_BASIC(ALBUM_CODE,ALBUM_TITLE,ALBUM_ARTIST,ALBUM_LANGUAGE,ALBUM_ISSUE_DATE,ALBUM_ISSUE_COMPANY,ALBUM_GENRE,ALBUM_COVER_PHOTO,REMARK,CREATE_AUTHOR,CREATE_DATETIME,UPDATE_AUTHOR,UPDATE_DATETIME) VALUES (1,'RUMORS','Fleetwood Mac','EN',null,null,'Folk',null,null,null,null,null,current_timestamp()) ;
INSERT INTO ALBUM_BASIC(ALBUM_CODE,ALBUM_TITLE,ALBUM_ARTIST,ALBUM_LANGUAGE,ALBUM_ISSUE_DATE,ALBUM_ISSUE_COMPANY,ALBUM_GENRE,ALBUM_COVER_PHOTO,REMARK,CREATE_AUTHOR,CREATE_DATETIME,UPDATE_AUTHOR,UPDATE_DATETIME) VALUES (2,'Communique','Dire Straits','EN',null,null,'Folk',null,null,null,null,null,current_timestamp()) ;
INSERT INTO ALBUM_BASIC(ALBUM_CODE,ALBUM_TITLE,ALBUM_ARTIST,ALBUM_LANGUAGE,ALBUM_ISSUE_DATE,ALBUM_ISSUE_COMPANY,ALBUM_GENRE,ALBUM_COVER_PHOTO,REMARK,CREATE_AUTHOR,CREATE_DATETIME,UPDATE_AUTHOR,UPDATE_DATETIME) VALUES (3,'Love Over Gold','Dire Straits','EN',null,null,'Folk',null,null,null,null,null,current_timestamp()) ;
INSERT INTO ALBUM_BASIC(ALBUM_CODE,ALBUM_TITLE,ALBUM_ARTIST,ALBUM_LANGUAGE,ALBUM_ISSUE_DATE,ALBUM_ISSUE_COMPANY,ALBUM_GENRE,ALBUM_COVER_PHOTO,REMARK,CREATE_AUTHOR,CREATE_DATETIME,UPDATE_AUTHOR,UPDATE_DATETIME) VALUES (4,'Emotion & Commotion','Jeff Beck','EN',null,null,null,null,null,null,null,null,current_timestamp()) ;

DELETE FROM ALBUM_TRACK ;
INSERT INTO ALBUM_TRACK(ALBUM_CODE,TRACK_NO,TRACK_NAME,REMARK,CREATE_AUTHOR,CREATE_DATETIME,UPDATE_AUTHOR,UPDATE_DATETIME) VALUES (3,1,'Telegraph Road',null,null,null,null,current_timestamp()) ;
INSERT INTO ALBUM_TRACK(ALBUM_CODE,TRACK_NO,TRACK_NAME,REMARK,CREATE_AUTHOR,CREATE_DATETIME,UPDATE_AUTHOR,UPDATE_DATETIME) VALUES (3,2,'Private Investigations',null,null,null,null,current_timestamp()) ;
INSERT INTO ALBUM_TRACK(ALBUM_CODE,TRACK_NO,TRACK_NAME,REMARK,CREATE_AUTHOR,CREATE_DATETIME,UPDATE_AUTHOR,UPDATE_DATETIME) VALUES (3,3,'Love Over Gold',null,null,null,null,current_timestamp()) ;
INSERT INTO ALBUM_TRACK(ALBUM_CODE,TRACK_NO,TRACK_NAME,REMARK,CREATE_AUTHOR,CREATE_DATETIME,UPDATE_AUTHOR,UPDATE_DATETIME) VALUES (3,4,'It Never Rains',null,null,null,null,current_timestamp()) ;
INSERT INTO ALBUM_TRACK(ALBUM_CODE,TRACK_NO,TRACK_NAME,REMARK,CREATE_AUTHOR,CREATE_DATETIME,UPDATE_AUTHOR,UPDATE_DATETIME) VALUES (3,5,'Industrial Disease',null,null,null,null,current_timestamp()) ;
INSERT INTO ALBUM_TRACK(ALBUM_CODE,TRACK_NO,TRACK_NAME,REMARK,CREATE_AUTHOR,CREATE_DATETIME,UPDATE_AUTHOR,UPDATE_DATETIME) VALUES (4,1,'I Put A Spell On You',null,null,null,null,current_timestamp()) ;
INSERT INTO ALBUM_TRACK(ALBUM_CODE,TRACK_NO,TRACK_NAME,REMARK,CREATE_AUTHOR,CREATE_DATETIME,UPDATE_AUTHOR,UPDATE_DATETIME) VALUES (4,2,'Hammerhead',null,null,null,null,current_timestamp()) ;
INSERT INTO ALBUM_TRACK(ALBUM_CODE,TRACK_NO,TRACK_NAME,REMARK,CREATE_AUTHOR,CREATE_DATETIME,UPDATE_AUTHOR,UPDATE_DATETIME) VALUES (4,3,'Somewhere Over The Rainbow',null,null,null,null,current_timestamp()) ;
INSERT INTO ALBUM_TRACK(ALBUM_CODE,TRACK_NO,TRACK_NAME,REMARK,CREATE_AUTHOR,CREATE_DATETIME,UPDATE_AUTHOR,UPDATE_DATETIME) VALUES (4,4,'There s No Other Me',null,null,null,null,current_timestamp()) ;

DELETE FROM ALBUM_CONTRIBUTOR ;
INSERT INTO ALBUM_CONTRIBUTOR(ALBUM_CODE,CONTRIBUTOR,CONTRIBUTED_TRACK,REMARK,CREATE_AUTHOR,CREATE_DATETIME,UPDATE_AUTHOR,UPDATE_DATETIME) VALUES (4,'Joss Stone','I Put A Spell On You',null,null,null,null,current_timestamp()) ;
INSERT INTO ALBUM_CONTRIBUTOR(ALBUM_CODE,CONTRIBUTOR,CONTRIBUTED_TRACK,REMARK,CREATE_AUTHOR,CREATE_DATETIME,UPDATE_AUTHOR,UPDATE_DATETIME) VALUES (4,'Joss Stone','There s No Other Me featuring Joss Stone',null,null,null,null,current_timestamp()) ;

