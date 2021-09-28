function addRow(id) {
    let tbody = document.getElementById(id).getElementsByTagName("TBODY")[0], sum = 0;

    const fio = document.getElementById("fio").value;
    const date = new Date(document.getElementById("date").value);
    const sex = document.getElementById("sex").value;
    const now = new Date().getFullYear();

    const row = document.createElement("TR");

    const td1 = document.createElement("TD");
    td1.appendChild(document.createTextNode(fio))
    const td2 = document.createElement("TD");
    td2.appendChild(document.createTextNode(sex))
    const td3 = document.createElement("TD");
    td3.appendChild(document.createTextNode(date.toLocaleDateString()))
    const td4 = document.createElement("TD");
    td3.className = "ages";
    td4.appendChild(document.createTextNode((now - date.getFullYear())))

    row.appendChild(td1);
    row.appendChild(td2);
    row.appendChild(td3);
    row.appendChild(td4);
    tbody.appendChild(row);

    const tr = tbody.getElementsByTagName("tr");
    let len = 0, i = tr.length;
    while (i--) {
        if (tr[i].childNodes[3] != null) {
            if (+tr[i].childNodes[3].innerHTML || +tr[i].childNodes[3].childNodes[0].innerHTML) {
                sum += +tr[i].childNodes[3].innerHTML || +tr[i].childNodes[3].childNodes[0].innerHTML;
                len++;
            }
        }
    }
    document.getElementById("avgAge").innerHTML = Math.round(sum / len);
}