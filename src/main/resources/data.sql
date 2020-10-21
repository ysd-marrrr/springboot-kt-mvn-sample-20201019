INSERT INTO items (id, name, type) VALUES(1, "ひのきのぼう", "ぶき") ON DUPLICATE KEY UPDATE id=id;
INSERT INTO items (id, name, type) VALUES(2, "きのいた", "ぼうぐ") ON DUPLICATE KEY UPDATE id=id;
INSERT INTO items (id, name, type) VALUES(3, "おもちゃのつるぎ", "ぶき") ON DUPLICATE KEY UPDATE id=id;