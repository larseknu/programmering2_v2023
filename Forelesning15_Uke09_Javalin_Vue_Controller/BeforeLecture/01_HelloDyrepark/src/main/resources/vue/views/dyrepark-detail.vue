<template id="dyrepark">
  <h1>Dyr i {{parkNavn}}</h1>
  <ul>
    <li v-for="dyr in dyreListe">
      <h2>{{dyr.id + " - " + dyr.navn}}</h2>
    </li>
  </ul>

</template>
<script>
app.component("dyrepark-detail", {
  template: "#dyrepark",
  data: () => ({
    dyreListe: [],
  }),
  created() {
    const parkNavnParam = this.$javalin.pathParams["dyrepark-id"];
    fetch (`/api/dyrepark/${parkNavnParam}`)
        .then(res => res.json())
        .then(res => {
          this.dyreListe = res
          this.parkNavn = parkNavnParam
        })
        .catch(() => alert("Feil ved uthenting av dyr i parken " + parkNavnParam));
  }
});
</script>
<style>
.hello-world {
  color: aquamarine;
}
</style>