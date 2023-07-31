INSERT INTO trouble_shooting_questions(question_id, question, question_code, previous_question_code, previous_question_answer) VALUES (1, 'Is your car silent when you turn the key?', 'q0', '', '');
INSERT INTO trouble_shooting_questions(question_id, question, question_code, previous_question_code, previous_question_answer) VALUES (2, 'Are the battery terminals corroded?', 'q1', 'q0', 'yes');
INSERT INTO trouble_shooting_questions(question_id, question, question_code, previous_question_code, previous_question_answer) VALUES (3, 'Clean terminals and try starting again', 'q2', 'q1', 'yes');
INSERT INTO trouble_shooting_questions(question_id, question, question_code, previous_question_code, previous_question_answer) VALUES (4, 'Replace cables and try again', 'q3', 'q1', 'no');
INSERT INTO trouble_shooting_questions(question_id, question, question_code, previous_question_code, previous_question_answer) VALUES (5, 'Does the car make a clicking noise?', 'q4', 'q0', 'no');
INSERT INTO trouble_shooting_questions(question_id, question, question_code, previous_question_code, previous_question_answer) VALUES (6, 'Replace the battery', 'q5', 'q4', 'yes');
INSERT INTO trouble_shooting_questions(question_id, question, question_code, previous_question_code, previous_question_answer) VALUES (7, 'Does the car crank up fail to start?', 'q6', 'q4', 'no');
INSERT INTO trouble_shooting_questions(question_id, question, question_code, previous_question_code, previous_question_answer) VALUES (8, 'Check spark plug connections', 'q7', 'q6', 'yes');
INSERT INTO trouble_shooting_questions(question_id, question, question_code, previous_question_code, previous_question_answer) VALUES (9, 'Does the engine start and then die?', 'q8', 'q6', 'no');
INSERT INTO trouble_shooting_questions(question_id, question, question_code, previous_question_code, previous_question_answer) VALUES (10, 'Does your car have fuel injection?', 'q9', 'q8', 'yes');
INSERT INTO trouble_shooting_questions(question_id, question, question_code, previous_question_code, previous_question_answer) VALUES (11, 'Get it in for service', 'q10', 'q9', 'yes');
INSERT INTO trouble_shooting_questions(question_id, question, question_code, previous_question_code, previous_question_answer) VALUES (12, 'Check to ensure the choke is opening and closing', 'q11', 'q9', 'no');