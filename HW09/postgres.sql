--Создание таблицы с вопросами
CREATE TABLE questions
(
    id SERIAL PRIMARY KEY,
    question VARCHAR NOT NULL
);

--Заполнение таблицы с вопросами
INSERT INTO questions (question) VALUES
                                     ('Сколько гномов отправилось вместе с хоббитом Бильбо за сокровищами?'),
                                     ('Кем, как говорит название повести братьев Стругацких, трудно быть?'),
                                     ('Наводящие ужас полуженщины - полугрифы из греческой мифологии.');

--Создание таблицы с ответами
CREATE TABLE answers
(
    id SERIAL PRIMARY KEY,
    answer VARCHAR NOT NULL,
    question_id INTEGER REFERENCES questions (id),
    FOREIGN KEY (question_id) REFERENCES questions (id)
);

--Заполнение таблицы с ответами
INSERT INTO answers (answer, question_id) VALUES
                                              ('5',1),('10',1), ('130',1),
                                              ('магом',2),('богом',2), ('Гарри Поттером',2), ('человеком',2),
                                              ('гарпии', 3),('грифоны',3),('циклопы',3), ('валькирии',3);

--Создание таблицы с правильными ответами
CREATE TABLE true_answers
(
    id SERIAL PRIMARY KEY,
    question_id INTEGER,
    answer_id INTEGER,
    FOREIGN KEY (question_id) REFERENCES questions (id),
    FOREIGN KEY (answer_id) REFERENCES answers (id)
);

--Заполнение таблицы с правильными ответами
INSERT INTO true_answers (question_id, answer_id) VALUES
                                                      (1,2), (2,5), (3,8);

--Список вопросов с вариантами ответов
SELECT q.question, a.answer
FROM questions q
         JOIN answers a ON q.id = a.question_id

--Список вопросов с правильными ответами
SELECT q.question, a.answer
FROM true_answers ta
         JOIN questions q ON ta.question_id = q.id
         JOIN answers a ON ta.answer_id = a.id;






