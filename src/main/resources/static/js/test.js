  document.getElementById("selectBox").addEventListener("change", (e) => {
    const val = e.target.value;
    console.log(val);
    if (val) {
      window.location.replace(`/?lang=${val}`);
    }
  });

