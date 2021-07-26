/**
 * Автоматическое изменение высоты текстового блока под содержимое
 *
 * @param id            идентификатор блока
 * @param className     класс блока
 */
function autoResize(id, className) {
    $(function () {
        var textArea = $(id),
            hiddenDiv = $(document.createElement('div')),
            content = null;
        hiddenDiv.addClass(className);
        hiddenDiv.hide();
        hiddenDiv.id = "hidDiv-" + id;

        $(textArea).after(hiddenDiv);
        textArea.on('keyup', function () {
            content = $(this).val();
            content = content.replace(/\n/g, '<br>');
            hiddenDiv.html(content);
            $(this).css('height', hiddenDiv.height());
        });
    });
}