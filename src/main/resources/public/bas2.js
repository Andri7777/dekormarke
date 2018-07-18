// function message() {
//    alert('Привіт усім');
// }
// message();

// var name = prompt('What is your name ?');
//
// function userName() {
//     var message = 'Hello'
//     alert(message +" " + name);
// }
// userName();

// function name(form,text) {
//     form = 'Ivan' + form + 'Hello';
//     alert(form + ': ' + text);
// }
// name('Ivan','Haw do you du');
// name('Ivan','Haw do  ');

// function func(from,text) {
//     if (from == undefined){
//         alert('тексу немає')
//     }
//     alert(from + ":" + text);
// }
// func('Іван','Привіт');
// func('Еван','Дурак');
// func('Еван');
//
// function findParol() {
//     var par = prompt('Введіть пароль');
//     if (par =1){
//         return true;
//     } else {
//         return par;
//     }
//
// }
//          заокруглення
// var n = 12.356;
// alert(n.toFixed(2));
// alert(n.toFixed(4));
// alert(n.toFixed(2.365));
//  // перенос строкиalert('Hello \nWorld');
// var str = 'JQuery';
// alert(str.charAt(1));  виводить другу букву
// alert('hello world'.toUpperCase()); великі букви
//          створення обєкта
// var person = {};
//
// person['name'] = 'Ivan';
// person['age'] = 25;
//
//
// alert(person.name + " " + person.age);

// var person = {};
//
// person.age = 25 ;
// var key= 'age';
// alert(person[key]);
// alert(person.age);

var menu = {
    tato: 200,
    mishka: 300,
    bodiya: 'shef'
};

// for (var key in menu) {
// alert('працівник' + key + 'начальник' + menu[key]);
// }

// var count = 0;
//
// for (var key in menu){
//     count++;
// }
//
// alert('всього' + count);

// Object.keys(menu).length;