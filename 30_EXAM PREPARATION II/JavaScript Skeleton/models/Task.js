const mongoose = require('mongoose');

const taskSchema=new mongoose.Schema({
    title: {type:String, required:true},
    comments: {type:String, required: true}
});

