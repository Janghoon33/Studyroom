import React from "react";
import 'css/Board.css';

export default function Single({tweet}){
    return(
        <div className="tweet">
            <div className="writer"><h6>{tweet.writer}</h6></div>
            <div className="date">{tweet.date}</div>
            <div className="content">{tweet.content}</div>
            <hr></hr>
        </div>
    )
}