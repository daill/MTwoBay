/*
 * Copyright 2021 Christian Kramer
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files
 *  (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge,
 *  publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do
 *  so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT
 * LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO
 * EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

POST https://discordapp.com/api/applications/{app_id}/commands

{
    "name": "coin",
    "description": "Flip a coin get the result and stand by the result!"
}

{
    "name": "valheim",
    "description": "Current valheim server data"
}

{
    "name": "motd",
    "description": "Display the current motd"
}

{
    "name": "help",
    "description": "Just a small help output"
}


{
    "name": "stats",
    "description": "Get stats for specific user",
    "options": [
    {
        "name": "nick",
        "description": "The nick to get",
        "type": 3,
        "required": true
    },
    {
        "name": "game",
        "description": "The nick to get",
        "type": 3,
        "required": true,
        "choices": [
            {
                "name": "COD Warzone",
                "value": "warzone"
            },
            {
                "name": "COD Cold War",
                "value": "cold-war"
            },
            {
                "name": "COD Vanguard",
                "value": "vanguard"
            },
            {
                "name": "Battlefield V",
                "value": "bfv"
            },
            {
                "name": "Battlefield 1",
                "value": "bf1"
            },
            {
                "name": "Battlefield 2042",
                "value": "bf2042"
            }
        ]
    },
    ]
}

{
    "name": "addcite",
    "description": "Roll a dice to have a random number",
    "options": [
    {
        "name": "sides",
        "description": "The sides of the dice",
        "type": 3,
        "required": "True",
        "choices": [
            {
                "name": "Stromberg",
                "value": "Stromberg"
            },
            {
                "name": "Berthold Heisterkamp",
                "value": "berthold-heisterkamp"
            },
        ]
    }
]
}

{
    "name": "getcite",
    "description": "Chose a character and get you random cite",
    "options": [
    {
        "name": "character",
        "description": "Character",
        "type": 3,
        "required": "True",
        "choices": [
            {
                "name": "Stromberg",
                "value": "Stromberg"
            },
            {
                "name": "Berthold Heisterkamp",
                "value": "berthold-heisterkamp"
            },
        ]
    }
]
}

{
    "name": "dice",
    "description": "Roll a dice to have a random number",
    "options": [
    {
        "name": "sides",
        "description": "The sides of the dice",
        "type": 3,
        "required": "True",
        "choices": [
            {
                "name": "6",
                "value": "6"
            },
            {
                "name": "12",
                "value": "12"
            },
            {
                "name": "20",
                "value": "20"
            }
        ]
    }
]
}
