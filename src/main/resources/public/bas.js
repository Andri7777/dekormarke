// alert('зараз буде помилка');
// [1,2].forEach(alert)
// var message;
// message = 'Hello';
// alert(message);

// var helo = 'java';
// var num = 'ford';
// helo = num;
// alert(helo);
// alert(num);

// var COLOR_RED = "F00";
// var color = COLOR_RED;
// alert(color);

// var name = 'Vasiliy';
// var admin;
//
// admin = name;
// alert(admin);

// var f = "2";
// // var d = "4";
// // alert(+f + d);
//
// var a = true;
// var b = 3>4;
// alert(b);
// alert(a==b);

// var years = prompt('Скильки вам рокив');
// alert('Вам' + years + 'рокив');
//
// var many = prompt('Скильки ви хочете грошей');
// var vork = prompt('Ким ви хочете працювати');
// var years = prompt('Скильки вам рокив');
// alert('Ви хочете мати ' + many + 'грошей'      +  'Ви хочете рацювати ' + vork + 'Вам' + years + 'рокив');

// var isAdmin = confirm('you are admin?')
// alert(isAdmin);

var pet = prompt('Яка ваша улюблена тваринка');
var num = prompt('Введіть чило від 1 до 20');
var numResult;
var color = prompt('Який ваш колір');
var colorResult;
var word = prompt('Виберіть букву');
var wordResult;



switch (num) {
    case "1":
        numResult = 'Ви Мохнатий ';
        break;
    case "2":
        numResult = 'Ви Двоголовий';
        break;
    case "3":
        numResult = 'Ви Рогатий';
        break;
    case "4":
        numResult = 'Ви Лисий';
        break;
    case "5":
        numResult = 'Ви Безхвостий';
        break;
    case "6":
        numResult = 'Ви Робот-';
        break;
    case "7":
        numResult = 'Ви Нестрижений';
        break;
    case "8":
        numResult = 'Ви Безсовістний';
        break;
    case "9":
        numResult = 'Ви Хамовитий';
        break;
    case "10":
        numResult = 'Ви Шалений';
        break;
    case "11":
        numResult = 'Ви Зомбі-';
        break;
    case "12":
        numResult = 'Ви Сиро-Мудрий';
        break;
    case "13":
        numResult = 'Ви Смачний';
        break;
    case "14":
        numResult = 'Ви Не Проханий';
        break;
    case "15":
        numResult = 'Ви Облізлий';
        break;
    case "16":
        numResult = 'Ви Кмітливий';
        break;
    case "17":
        numResult = 'Ви Пригаючий';
        break;
    case "18":
        numResult = 'Ви Набридливий';
        break;
    case "19":
        numResult = 'Ви Кортконогий';
        break;
}
switch (color){
    case 'червоний':
        colorResult = 'Який Любить Ховатися В Норці ';
        break;
    case 'білий':
        colorResult = 'Який Сидить В Туалеті';
        break;
    case 'синій':
        colorResult = 'Який Біжить З Лісу';
        break;
    case 'зелений':
        colorResult = 'Який Сидить У Болоті';
        break;
    case 'чорний':
        colorResult = 'Який Любить Жувати Траву';
        break;
    case 'жовтий':
        colorResult = 'Який Вибігає з Туалету';
        break;
    case 'фіолетовий':
        colorResult = 'Який Носиться По Лісі';
        break;
    case 'голубий':
        colorResult = 'Який Плаває В Болоті';
        break;
    case 'салатовий':
        colorResult = 'Який Кричить В Гнізді';
        break;
    case 'сірий':
        colorResult = 'Який Ображає Кроликів';
        break;
    case 'коричневий':
        colorResult = 'Який Летить На Унітазі У Космос';
        break;
    case 'блакитний':
        colorResult = 'Який Заблудився В СуперМаркеті';
        break;
    case 'помаранчевий':
        colorResult = 'Який Люьить Гречку В Кущах';
        break;
    case 'бірюзовий':
        colorResult = 'Який Біжить В Трусах';
        break;
    case 'срібний':
        colorResult = 'Який Заваджає Страусу Вчиться';
        break;
    case 'золотий':
        colorResult = 'Який Чекає Автобуса';
        break;
    case 'рожевий':
        colorResult = 'Який Бігає З Трусами На Голові';
        break;
    case 'оранжевий':
        colorResult = 'Який Лізе На Дерево';
        break;
    case 'шоколадний':
        colorResult = 'Який Любить Писати  Вірші';
        break;

    case 'бежевий':
        colorResult = 'Який Замучився Рахувати Равликів';
        break;

    case 'охра':
        colorResult = 'Який Розводить Метеликів';
        break;
}

switch (word){
    case 'б':
        wordResult = 'І Кричить Я ВСРАВСЯ!!!';
        break;
    case 'а':
        wordResult = 'І Кричить Я Знаю Де Польща!!!';
        break;
    case 'м':
        wordResult = 'І Кричить Заберіть Мене Звідси!!!';
        break;
    case 'н':
        wordResult = 'І Кричить Слава Україні!!!';
        break;
    case 'я':
        wordResult = 'І Кричить Де Поділися Лосі!!!';
        break;
    case 'о':
        wordResult = 'І Кричить Я Не Лось!!!';
        break;
    case 'і':
        wordResult = 'І Кричить Я Не Боюся Хомячків!!!';
        break;
    case 'с':
        wordResult = 'І Кричить Я Більше Не Буду!!!';
        break;
    case 'п':
        wordResult = 'І Кричить Я Більше Не Можу!!!';
        break;
    case 'к':
        wordResult = 'І Кричить Я Страшний Лось!!!';
        break;
    case 'л':
        wordResult = 'І Кричить Я Малюю!!!';
        break;
    case 'в':
        wordResult = 'І Кричить Я знаю Де Є Бегемоти!!!';
        break;
    case 'ф':
        wordResult = 'І Кричить Я Знаю Формулу Успіху!!!';
        break;
    case 'т':
        wordResult = 'І Кричить Я Правду Про Жираф!!!';
        break;
    case 'ю':
        wordResult = 'І Кричить Я Маленький Хомячок!!!';
        break;
    case 'з':
        wordResult = 'І Кричить Я Зелена Мурвшка!!!';
        break;
    case 'ш':
        wordResult = 'І Кричить Я Маленький Пірат!!!';
        break;
    case 'ц':
        wordResult = 'І Кричить Я Загубив Свої Роги!!!';
        break;
    case 'є':
        wordResult = 'І Кричить Я Образився На Космонавтів!!!';
        break;
    case 'ч':
        wordResult = 'І Кричить Я Не Люблю Зомби-Програмістів!!!';
        break;
    case 'й':
        wordResult = 'І Кричить Я Врахений Своєю Красою!!!';
        break;
    case 'д':
        wordResult = 'І Кричить Я Люблю Мишачити!!!';
        break;
    case 'ж':
        wordResult = 'І Кричить Я Не Знаю Хто Такі СлоноЛосі!!!';
        break;
    case 'щ':
        wordResult = 'І Кричить Мені Набридли Свині!!!';
        break;
    case 'е':
        wordResult = 'І Кричить Дайте Туалетний Папір!!!';
        break;
    case 'р':
        wordResult = 'І Кричить   Туалетний Папір Не Смачний!!!';
        break;
    case 'ь':
        wordResult = 'І Кричить Я хочу На Місяць!!!';
        break;
    case 'и':
        wordResult = 'І Кричить Мені Смердить Хомяками!!!';
        break;
    case 'ї':
        wordResult = 'І Кричить Я Загубив Свої Труси!!!';
        break;


}
alert(numResult+ " " + pet+ " " + colorResult + " " + wordResult);