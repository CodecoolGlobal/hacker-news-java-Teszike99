const api_url = "https://api.hnpwa.com/v0/news/4.json";
async function getUrl(){
    const response = await fetch(api_url);
    const data = await response.json();
    console.log(data);

}

function testMethod(){
    let newDiv = document.createElement("div");
    newDiv.innerHTML = "Its working now lol";
    document.body.appendChild(newDiv);
    console.log(document.body);
}

testMethod();