<template id="dyr">
  <div v-if="dyr">
    <h1>{{dyr.art}} - {{dyr.navn}}</h1>
    <p>Har bursdag {{dyr.fodselsdag[2]}}.{{dyr.fodselsdag[1]}}</p>
    <img v-if="dyr.art === 'Sjimpanse'" src="https://images.unsplash.com/photo-1544377747-75ce8da6c699?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=914&q=80" width="200" height="300" />
    <img v-else-if="dyr.art === 'Panda'" src="https://images.unsplash.com/photo-1528359645462-5ff224bf906e?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1951&q=80" width="400" height="300" />
    <img v-else  src="https://images.unsplash.com/photo-1607417314754-53baa674c63e?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1950&q=80" width="300" height="200" />
  </div>
</template>
<script>
app.component("dyr-detail", {
  template: "#dyr",
  data: () => ({
    dyr: null,
  }),
  created() {
    const parkNavnParam = this.$javalin.pathParams["dyrepark-id"];
    const dyrIdParam = this.$javalin.pathParams["dyr-id"];
    fetch (`/api/dyrepark/${parkNavnParam}/dyr/${dyrIdParam}`)
        .then(res => res.json())
        .then(res => {
          this.dyr = res
        })
        .catch(() => alert("Feil ved uthenting av dyr med id " + dyrIdParam +" i parken " + parkNavnParam));
  }
});
</script>