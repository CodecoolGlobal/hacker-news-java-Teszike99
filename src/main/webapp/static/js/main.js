async function fetchUrl(url) {
    const response = await fetch(url);
    return response.json();
}


function cardBuilder() {
    let url = '/json';
    let number = 1

    let home = document.querySelector(".main");
    home.addEventListener("click", () => {
        url = `/json?page=`;
        createElement(url, number)
    })

    let newest = document.querySelector(".newest");
    newest.addEventListener("click", () => {
        url = `/newest?page=`;
        createElement(url, number)
    })

    let jobs = document.querySelector(".jobs");
    jobs.addEventListener("click", () => {
        url = `/json?page=`;
        createElement(url, number)
    })

    let nextButton = document.querySelector(".nextbutton")
    nextButton.addEventListener("click", () => {
        number = number +1;
        createElement(url, number)
    })

    let prevButton = document.querySelector(".prevbutton")
    prevButton.addEventListener("click", () => {
        number = number -1;
        createElement(url, number)
    })

}

cardBuilder()

function createElement(url, num) {
    let data = fetchUrl(url + num);
    data.then(data => {

    let flexCont = document.querySelector(".flex-container");
        flexCont.innerHTML = "";

        for (const elem of data) {
    let card =  document.createElement('div');
        card.classList.add("card");
    let createA = document.createElement('a');
    let createAText = document.createTextNode(elem.title);
    createA.setAttribute('href', elem.url);
    createA.appendChild(createAText);
    let posted = document.createElement('p');
    posted.innerText = elem.time_ago;
    let author = document.createElement('p');
    author.innerText = elem.user;
    card.appendChild(createA);
    card.appendChild(posted);
    card.appendChild(author);
    flexCont.appendChild(card);
            }



}) }