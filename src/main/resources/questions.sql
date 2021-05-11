--Основы JS
INSERT INTO public.question (id, name, category, technology, allotted_time, level) VALUES (197, 'Результат выражения null == undefined', 'JSBASIC', 'JS',60000, 'JS_STUDY_COURSE');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (795, 197, true, 'True.', 'JSBASIC');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (796, 197, false, 'False.', 'JSBASIC');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (797, 197, false, 'Object.', 'JSBASIC');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (798, 197, false, 'Error.', 'JSBASIC');

INSERT INTO public.question (id, name, category, technology, allotted_time, level) VALUES (198, 'Результат инкремента: let counter = 1; counter++;', 'JSBASIC', 'JS',60000, 'JS_STUDY_COURSE');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (799, 198, true, '1', 'JSBASIC');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (800, 198, false, '2', 'JSBASIC');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (801, 198, false, '3', 'JSBASIC');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (802, 198, false, '0', 'JSBASIC');

INSERT INTO public.question (id, name, category, technology, allotted_time, level) VALUES (199, 'Результат выражения "1" && true || null && 1', 'JSBASIC', 'JS',60000, 'JS_STUDY_COURSE');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (803, 199, false, '1', 'JSBASIC');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (804, 199, false, '''1''', 'JSBASIC');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (805, 199, false, 'null', 'JSBASIC');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (806, 199, true, 'true', 'JSBASIC');

INSERT INTO public.question (id, name, category, technology, allotted_time, level) VALUES (200, 'Результат выполнения var a = 10; var b = 15; (a % 2 || b % 3) ? ''Try again'' : ''OK''; ', 'JSBASIC', 'JS',60000, 'JS_STUDY_COURSE');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (807, 200, true, '''OK''', 'JSBASIC');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (808, 200, false, '''Try again''', 'JSBASIC');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (809, 200, false, 'Error', 'JSBASIC');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (810, 200, false, 'SyntaxError', 'JSBASIC');

INSERT INTO public.question (id, name, category, technology, allotted_time, level) VALUES (201, 'Разница includes/some', 'JSBASIC', 'JS',60000, 'JS_STUDY_COURSE');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (811, 201, false, 'includes возвращает элемент, который удовлетворяет условию, а some проверит есть ли заданный элемент в массиве', 'JSBASIC');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (812, 201, false, 'includes проверяет удовлетворяет ли какой-либо элемент массива условию, а some проверяет содержит ли массив определённый элемент', 'JSBASIC');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (813, 201, true, 'some проверяет удовлетворяет ли какой-либо элемент массива условию, а includes проверяет содержит ли массив определённый элемент', 'JSBASIC');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (814, 201, false, 'includes возвращает true/false, а some возвращает элемент', 'JSBASIC');


INSERT INTO public.question (id, name, category, technology, allotted_time, level) VALUES (202, 'Для чего оператор “!!”', 'JSBASIC', 'JS',60000, 'JS_STUDY_COURSE');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (815, 202, false, 'Преобразует true -> false, false -> true;', 'JSBASIC');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (816, 202, true, 'Заставит систему проинтерпретировать ваше выражение в булевом контексте', 'JSBASIC');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (817, 202, false, 'Что б проверить значение', 'JSBASIC');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (818, 202, false, 'Любое значение в false переведет', 'JSBASIC');

INSERT INTO public.question (id, name, category, technology, allotted_time, level) VALUES (203, 'console.log(employeeId); var employeeId = ''19000'';', 'JSBASIC', 'JS',60000, 'JS_STUDY_COURSE');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (819, 203, false, '‘19000’', 'JSBASIC');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (820, 203, true, 'undefined', 'JSBASIC');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (821, 203, false, 'Type Error', 'JSBASIC');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (822, 203, false, 'ReferenceError: employeeId is not defined', 'JSBASIC');
--Основы JS

--Объекты, функции
-- needs photo
INSERT INTO public.question (id, name, category, technology, allotted_time, level) VALUES (204, 'Какой результат выполнения', 'JSFUNCTIONS', 'JS',60000, 'JS_STUDY_COURSE');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (823, 204, false, 'Error', 'JSFUNCTIONS');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (824, 204, false, 'undefined', 'JSFUNCTIONS');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (825, 204, true, '''Alex''', 'JSFUNCTIONS');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (826, 204, false, 'function(name) { return name;}', 'JSFUNCTIONS');

-- needs photo
INSERT INTO public.question (id, name, category, technology, allotted_time, level) VALUES (205, 'Какой результат выполнения', 'JSFUNCTIONS', 'JS',60000, 'JS_STUDY_COURSE');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (827, 205, true, '5', 'JSFUNCTIONS');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (828, 205, false, 'undefined', 'JSFUNCTIONS');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (829, 205, false, '2', 'JSFUNCTIONS');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (830, 205, false, '(2,4,5)', 'JSFUNCTIONS');

--needs photo
INSERT INTO public.question (id, name, category, technology, allotted_time, level) VALUES (206, 'Какой результат выполнения', 'JSFUNCTIONS', 'JS',60000, 'JS_STUDY_COURSE');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (831, 206, false, 'undefined', 'JSFUNCTIONS');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (832, 206, false, 'error', 'JSFUNCTIONS');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (833, 206, true, '0', 'JSFUNCTIONS');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (834, 206, false, 'null', 'JSFUNCTIONS');

--needs photo
INSERT INTO public.question (id, name, category, technology, allotted_time, level) VALUES (231, 'Какой результат выполнения', 'JSFUNCTIONS', 'JS',60000, 'JS_STUDY_COURSE');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (927, 231, false, '''122345''', 'JSFUNCTIONS');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (928, 231, true, 'undefined', 'JSFUNCTIONS');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (929, 231, false, 'Type Error', 'JSFUNCTIONS');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (930, 231, false, 'ReferenceError: employeeId is not defined', 'JSFUNCTIONS');

--needs photo
INSERT INTO public.question (id, name, category, technology, allotted_time, level) VALUES (207, 'Какой результат выполнения', 'JSFUNCTIONS', 'JS',60000, 'JS_STUDY_COURSE');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (835, 207, false, '[ 2, 4, 8, 12, 16 ] [ 0, 3, 0, 0, 9, 0, 12]', 'JSFUNCTIONS');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (836, 207, false, '[ 2, 4, 8, 12, 16 ] [ 3, 9, 12]', 'JSFUNCTIONS');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (837, 207, true, '[ 2, 4, 8, 12, 16 ] true', 'JSFUNCTIONS');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (838, 207, false, '[ 2, 4, 8, 12, 16 ] false', 'JSFUNCTIONS');

--needs photo
INSERT INTO public.question (id, name, category, technology, allotted_time, level) VALUES (208, 'Что будет выведено в консоль?', 'JSFUNCTIONS', 'JS',60000, 'JS_STUDY_COURSE');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (839, 208, false, 'hello, world', 'JSFUNCTIONS');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (840, 208, false, 'В коде ошибка', 'JSFUNCTIONS');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (841, 208, false, 'hello, hello', 'JSFUNCTIONS');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (842, 208, true, 'undefined, world', 'JSFUNCTIONS');

INSERT INTO public.question (id, name, category, technology, allotted_time, level) VALUES (209, 'Что такое рекурсия?', 'JSFUNCTIONS', 'JS',60000, 'JS_STUDY_COURSE');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (843, 209, true, 'Вызов функцией самой себя', 'JSFUNCTIONS');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (844, 209, false, 'Прохождение по циклу с вызовом разных функций', 'JSFUNCTIONS');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (845, 209, false, 'Прохождение по циклу с вызовом одной и той же функции', 'JSFUNCTIONS');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (846, 209, false, 'Передача одной функции в другую функцию', 'JSFUNCTIONS');
--Объекты, функции

--Типы данных, преобразование
INSERT INTO public.question (id, name, category, technology, allotted_time, level) VALUES (210, 'Типы данных', 'JSWWD', 'JS',60000, 'JS_STUDY_COURSE');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (847, 210, false, 'number, string, boolean, null, undefined, symbol', 'JSWWD');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (848, 210, false, 'number, string, boolean, null, undefined, object', 'JSWWD');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (849, 210, false, 'number, string, boolean, null, undefined, symbol, object', 'JSWWD');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (850, 210, true, 'number, string, boolean, null, undefined, symbol, bigint, object', 'JSWWD');

INSERT INTO public.question (id, name, category, technology, allotted_time, level) VALUES (211, 'Результат выражения undefined || null || 0', 'JSWWD', 'JS',60000, 'JS_STUDY_COURSE');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (851, 211, false, 'false', 'JSWWD');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (852, 211, false, 'null', 'JSWWD');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (853, 211, true, '0', 'JSWWD');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (854, 211, false, 'undefined', 'JSWWD');

INSERT INTO public.question (id, name, category, technology, allotted_time, level) VALUES (212, 'Результат выражения true + false', 'JSWWD', 'JS',60000, 'JS_STUDY_COURSE');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (855, 212, false, 'false1', 'JSWWD');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (856, 212, false, 'NaN', 'JSWWD');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (857, 212, true, '1', 'JSWWD');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (858, 212, false, '''truefalse''', 'JSWWD');

INSERT INTO public.question (id, name, category, technology, allotted_time, level) VALUES (213, 'Результат выражения 6 / ‘3’', 'JSWWD', 'JS',60000, 'JS_STUDY_COURSE');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (859, 213, false, 'NaN', 'JSWWD');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (860, 213, true, '2', 'JSWWD');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (861, 213, false, '''2''', 'JSWWD');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (862, 213, false, 'Error', 'JSWWD');

--needs photo
INSERT INTO public.question (id, name, category, technology, allotted_time, level) VALUES (214, 'Какой результат выполнения кода', 'JSWWD', 'JS',60000, 'JS_STUDY_COURSE');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (863, 214, false, '123', 'JSWWD');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (864, 214, true, '456', 'JSWWD');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (865, 214, false, 'Error', 'JSWWD');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (866, 214, false, 'Undefined', 'JSWWD');

--needs photo
INSERT INTO public.question (id, name, category, technology, allotted_time, level) VALUES (215, 'Какой результат выполнения кода var foo = function bar() { return 12; }; typeof bar();', 'JSWWD', 'JS',60000, 'JS_STUDY_COURSE');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (867, 215, true, 'Referenceerror', 'JSWWD');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (868, 215, false, '12', 'JSWWD');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (869, 215, false, 'Error', 'JSWWD');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (870, 215, false, 'Undefined', 'JSWWD');
--Типы данных, преобразование

--Асинхронность
--needs photo
INSERT INTO public.question (id, name, category, technology, allotted_time, level) VALUES (216, 'Какой результат выполнения кода:', 'JSASYNCHRONY', 'JS',60000, 'JS_STUDY_COURSE');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (871, 216, false, '1,2,3,4', 'JSASYNCHRONY');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (872, 216, false, '4,3,1,2', 'JSASYNCHRONY');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (873, 216, false, '4,3,2,1', 'JSASYNCHRONY');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (874, 216, true, '1,4,3,2', 'JSASYNCHRONY');

--needs photo
INSERT INTO public.question (id, name, category, technology, allotted_time, level) VALUES (217, 'Что будет выведено в консоль?', 'JSASYNCHRONY', 'JS',60000, 'JS_STUDY_COURSE');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (875, 217, true, 'abd', 'JSASYNCHRONY');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (876, 217, false, 'abde', 'JSASYNCHRONY');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (877, 217, false, 'abcde', 'JSASYNCHRONY');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (878, 217, false, 'Ничего', 'JSASYNCHRONY');

--needs photo
INSERT INTO public.question (id, name, category, technology, allotted_time, level) VALUES (218, 'Что будет выведено в консоль?', 'JSASYNCHRONY', 'JS',60000, 'JS_STUDY_COURSE');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (879, 218, false, '1,2,3', 'JSASYNCHRONY');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (880, 218, false, '3,2,1', 'JSASYNCHRONY');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (881, 218, true, '3,2,1', 'JSASYNCHRONY');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (882, 218, false, '2,3,1', 'JSASYNCHRONY');

INSERT INTO public.question (id, name, category, technology, allotted_time, level) VALUES (219, 'Какие виды состояния есть у promise?', 'JSASYNCHRONY', 'JS',60000, 'JS_STUDY_COURSE');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (883, 219, true, 'pending, fulfilled, rejected', 'JSASYNCHRONY');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (884, 219, false, 'promise не имеет состояния', 'JSASYNCHRONY');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (885, 219, false, 'success, failure', 'JSASYNCHRONY');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (886, 219, false, 'waiting, fulfilled, failed', 'JSASYNCHRONY');

--needs photo
INSERT INTO public.question (id, name, category, technology, allotted_time, level) VALUES (220, 'Что будет выведено в консоль?', 'JSASYNCHRONY', 'JS',60000, 'JS_STUDY_COURSE');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (887, 220, false, 'promise, undefined', 'JSASYNCHRONY');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (888, 220, false, '10, undefined', 'JSASYNCHRONY');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (889, 220, true, 'promise, promise', 'JSASYNCHRONY');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (890, 220, false, 'Ошибка вызовов async функций без await', 'JSASYNCHRONY');
--Асинхронность

--Контекст
INSERT INTO public.question (id, name, category, technology, allotted_time, level) VALUES (221, 'Что такое this?', 'JSFUNCTIONS', 'JS',60000, 'JS_STUDY_COURSE');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (891, 221, false, 'Ссылка на scope', 'JSASYNCHRONY');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (892, 221, false, 'Корневой объект', 'JSASYNCHRONY');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (893, 221, false, 'window', 'JSASYNCHRONY');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (894, 221, true, 'Контекст выполнения функции', 'JSASYNCHRONY');


INSERT INTO public.question (id, name, category, technology, allotted_time, level) VALUES (222, 'Что такое прототип объекта?', 'JSFUNCTIONS', 'JS',60000, 'JS_STUDY_COURSE');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (895, 222, false, 'This', 'JSASYNCHRONY');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (896, 222, false, '[[Scope]]', 'JSASYNCHRONY');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (897, 222, true, 'Объект, с предустановленными свойствами', 'JSASYNCHRONY');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (898, 222, false, 'Ссылка на родителя', 'JSASYNCHRONY');

--needs photo
INSERT INTO public.question (id, name, category, technology, allotted_time, level) VALUES (223, 'Какой результат выполнения кода?', 'JSFUNCTIONS', 'JS',60000, 'JS_STUDY_COURSE');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (899, 223, true, '‘xyz’', 'JSASYNCHRONY');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (900, 223, false, 'undefined', 'JSASYNCHRONY');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (901, 223, false, 'string', 'JSASYNCHRONY');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (902, 223, false, 'Referenceerror', 'JSASYNCHRONY');

--needs photo
--what is the correct answer??
INSERT INTO public.question (id, name, category, technology, allotted_time, level) VALUES (224, 'Какой из четырех способов приведет к ожидаемому результату?', 'JSFUNCTIONS', 'JS',60000, 'JS_STUDY_COURSE');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (903, 224, true, '1', 'JSASYNCHRONY');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (904, 224, false, '2', 'JSASYNCHRONY');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (905, 224, false, '3', 'JSASYNCHRONY');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (906, 224, false, '4', 'JSASYNCHRONY');


INSERT INTO public.question (id, name, category, technology, allotted_time, level) VALUES (225, 'Чему равняется контекст в момент вызова функции через оператор new?', 'JSFUNCTIONS', 'JS',60000, 'JS_STUDY_COURSE');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (907, 225, true, 'Первому переданному аргументу', 'JSASYNCHRONY');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (908, 225, false, 'Последнему переданному аргументу', 'JSASYNCHRONY');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (908, 225, false, 'Пустому новому объекту', 'JSASYNCHRONY');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (908, 225, false, 'Контекст не определен', 'JSASYNCHRONY');
--Контекст

--DOM
INSERT INTO public.question (id, name, category, technology, allotted_time, level) VALUES (226, 'Что такое DOM?', 'JSBROWSER', 'JS',60000, 'JS_STUDY_COURSE');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (909, 226, true, 'объектная модель документа, которая представляет все содержимое страницы в виде объектов, которые можно менять', 'JSBROWSER');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (910, 226, false, 'дополнительные объекты, предоставляемые браузером (окружением), чтобы работать со всем, кроме документа', 'JSBROWSER');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (911, 226, false, 'объект, представляющий стили', 'JSBROWSER');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (912, 226, false, 'разметка страниц в браузере', 'JSBROWSER');

INSERT INTO public.question (id, name, category, technology, allotted_time, level) VALUES (227, 'Что такое всплытие события?', 'JSBROWSER', 'JS',60000, 'JS_STUDY_COURSE');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (913, 227, true, 'После того, как событие сработает на самом вложенном элементе, оно также сработает на родителях, вверх по цепочке вложенности.', 'JSBROWSER');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (914, 227, false, 'Когда событие только возникло, оно начинает двигаться по DOM-дереву, начиная от корневого узла, до самого глубокого, на котором произошло событие. Попутно выполняются все обработчики связанные с этим событием.', 'JSBROWSER');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (915, 227, false, 'Позволяет запускать объявленные функции выше, чем они объявлены в контексте', 'JSBROWSER');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (916, 227, false, 'разметка страниц в браузере', 'JSBROWSER');

INSERT INTO public.question (id, name, category, technology, allotted_time, level) VALUES (228, 'Как активировать срабатывание обработчиков при всплытии события?', 'JSBROWSER', 'JS',60000, 'JS_STUDY_COURSE');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (917, 228, false, 'При подписке на событие нужно третьим аргументов передать флаг true', 'JSBROWSER');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (918, 228, false, 'Нужно делать подписку на специальный тип событий, например: ''bubling:click''', 'JSBROWSER');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (919, 228, true, 'Никак, это поведение по умолчанию', 'JSBROWSER');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (920, 228, false, 'При подписке на событие нужно третьим аргументом передать флаг false', 'JSBROWSER');

INSERT INTO public.question (id, name, category, technology, allotted_time, level) VALUES (229, 'Каким значением css свойства display можно скрыть элемент?', 'JSBROWSER', 'JS',60000, 'JS_STUDY_COURSE');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (921, 229, true, 'none', 'JSBROWSER');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (922, 229, false, 'hide', 'JSBROWSER');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (923, 229, false, 'no-visible', 'JSBROWSER');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (924, 229, false, 'off-stage', 'JSBROWSER');

INSERT INTO public.question (id, name, category, technology, allotted_time, level) VALUES (230, 'Каким образом используя только css можно задать стили, которые применятся при наведении на элемент?', 'JSBROWSER', 'JS',60000, 'JS_STUDY_COURSE');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (925, 230, false, 'использовать псевдокласс hover', 'JSBROWSER');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (926, 230, true, 'использовать псевдоэлемент hover', 'JSBROWSER');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (927, 230, false, 'использовать css хук onHove', 'JSBROWSER');
INSERT INTO public.answer_option (id, question_id, is_correct, name, category) VALUES (928, 230, false, 'в чистом css нет возможности задать стили для наведения на элемент', 'JSBROWSER');
--DOM