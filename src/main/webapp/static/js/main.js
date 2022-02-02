const api_url = "https://api.hnpwa.com/v0/news/4.json";
async function getUrl(){
    const response = await fetch(api_url);
    const data = await response.json();
    console.log(data);

}


function createCards(){
    let table = document.getElementById("table")
    for (let i=0; i<5; i++ ){
        let newRow = document.createElement("tr")
        for(let i=0; i<6; i++){
            let newCard = document.createElement("td")
            newCard.innerHTML = "itsWorkLOL"
            newCard.classList.add("card")
            newRow.appendChild(newCard)
        }
        table.appendChild(newRow)
    }
}

createCards();