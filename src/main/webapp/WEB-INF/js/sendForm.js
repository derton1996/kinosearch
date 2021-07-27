const elForm = document.getElementById('form');

/**
 * Перехвать отправки формы и подсовывание её в запрос в {@link sendForm}
 */
elForm.addEventListener('submit', function (e) {
    e.preventDefault();
    sendForm();
});

/**
 * Отправка на бэк формы статьи
 */
function sendForm() {
    length = document.getElementById("article").children.length;

    var ar = [];
    for (let i = 0; i < length; i++) {
        let doc = document.getElementById("article").children[i];
        for (let j = 0; j < doc.length; j++) {
            let area = doc[j];
            //пропускаем <br>
            if (area.type === undefined) {
                continue;
            }
            let obj = new Object();
            obj.content = area.value;
            obj.clazz = area.className;
            ar.push(obj);
        }
    }

    const formData = JSON.stringify(ar);
    const xhr = new XMLHttpRequest();
    xhr.open('POST', "http://localhost:8080/article/create");
    xhr.setRequestHeader('Content-Type', 'application/json')
    xhr.send(formData);
}