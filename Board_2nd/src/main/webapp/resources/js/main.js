/**
 * 
 */
var Vue = require('vue');
var Router = require('vue-router');

var hello_module = require('./hello');
var login_module = require('./login');


Vue.use(Router);

const Foo = { template: '<div>foo</div>' }
const Bar = { template: '<div>bar</div>' }


const routes = [
	{path : '/foo', component: Foo},
	{path : '/bar', component: Bar}
]

const router = new Router({
	routes
});

var app = new Vue({
	router
}).$mount('#app');

/*var modules = [];

modules.push(new hello_module());
modules.push(new login_module());

for(var i=0;i<modules.length;i++){
	modules[i].init();
}*/