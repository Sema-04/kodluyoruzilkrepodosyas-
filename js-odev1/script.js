let userName = prompt("Lütfen adınızı giriniz:");
document.getElementById("name").innerHTML = `<strong>${userName}</strong>`;

function startTime() {
    const clockElement = document.getElementById("clock");
    const days = ["Pazar", "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi"];

    setInterval(() => {
        let now = new Date();
        let hour = now.getHours().toString().padStart(2, '0');
        let minute = now.getMinutes().toString().padStart(2, '0');
        let second = now.getSeconds().toString().padStart(2, '0');
        let day = days[now.getDay()];

        clockElement.innerHTML = `${hour}:${minute}:${second} ${day}`;
    }, 1000);
}
